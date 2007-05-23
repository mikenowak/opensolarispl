#
# CDDL HEADER START
#
# The contents of this file are subject to the terms of the
# Common Development and Distribution License (the "License").
# You may not use this file except in compliance with the License.
#
# You can obtain a copy of the license at src/OPENSOLARIS.LICENSE
# or http://www.opensolaris.org/os/licensing.
# See the License for the specific language governing permissions
# and limitations under the License.
#
# When distributing Covered Code, include this CDDL HEADER in each
# file and include the License file at src/OPENSOLARIS.LICENSE.
# If applicable, add the following below this CDDL HEADER, with the
# fields enclosed by brackets "[]" replaced with your own identifying
# information: Portions Copyright [yyyy] [name of copyright owner]
#
# CDDL HEADER END
#
#
# Copyright 2006 Sun Microsystems, Inc.  All rights reserved.
# Use is subject to license terms.
#
#ident  "@(#)Makefile.java"
#

include $(TRANS)/common/locale/Makefile.@LOCALE
include @CATE

CLEAN_FILES += $(SRC_FILES)
ROOT_DIR=	$(ROOT_DIR_PARENT)

.KEEP_STATE:

all: $(FILES)

install: all $(ROOT_FILES)

clean:
	$(RM) $(CLEAN_FILES)

clobber lint:

$(SRC_FILES): $(BASEFILEDIR)/$$(@:%_$(JAVA_LOCALE_S).java=%_$(LOCALE_PLACEHOLDER).java)
	$(NATIVE2ASCII) $? | $(CLASSLOC_CONV) > $@
	-@ if [ "$(LOCALE)" = "zh_TW" ]; then \
		zh_HK=`echo $@ | sed -e 's/_zh_TW\./_zh_HK\./'`; \
		FILENOEXT=`echo $${zh_HK} | sed -e 's/_zh_HK\..*/_zh_HK/'`; \
		EXT=`echo $${zh_HK} | sed -e 's/.*_zh_HK\.//'`; \
		[ ! -d $(ROOT_DIR) ] && $(MKDIR) $(ROOT_DIR); \
		if [ "$${EXT}" = "java" ]; then \
			$(CAT) $? | $(SED) -e '/class/s/___LOCALE__/_zh_HK/' \
			| $(NATIVE2ASCII) > $${zh_HK}; \
			$(JAVAC) $${zh_HK}; \
			$(RM) $(ROOT_DIR)/$${FILENOEXT}.class; $(INS) -s -m $(FILEMODE) -f $(ROOT_DIR) $${FILENOEXT}.class; \
		else \
			$(NATIVE2ASCII) $? > $${zh_HK}; \
			$(RM) $(ROOT_DIR)/$${zh_HK}; $(INS) -s -m $(FILEMODE) -f $(ROOT_DIR) $${zh_HK}; \
		fi \
	fi

FRC:

include $(TRANS)/Makefile.trans.targ
