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
#
#ident  "@(#)Makefile"
#

JAVA_LOCALE_S:sh=	basename `pwd`

# include global definitions
include $(SRC)/src/messages/common/locale/Makefile.$(JAVA_LOCALE_S)
include ../Makefile.html

COMMON_SUBDIRS= art
sparc_SUBDIRS=
i386_SUBDIRS=
SUBDIRS=	$(COMMON_SUBDIRS) $($(MACH)_SUBDIRS)

all:=		TARGET= all
install:=	TARGET= install
clean:=		TARGET= clean
clobber:=	TARGET= clobber
lint:=		TARGET= lint

CLEAN_FILES += $(SRC_FILES)

.KEEP_STATE:

all: $(FILES) $(SUBDIRS)

install: all $(ROOT_FILES) $(SUBDIRS)

clean clobber: $(SUBDIRS)
	$(RM) $(CLEAN_FILES)

lint:

$(SRC_FILES): $(BASEFILEDIR)/$$@
	$(ICONV) $? | $(CST_CONV_TO_EUC) > $@

$(SUBDIRS): FRC
	-@cd $@; pwd; $(MAKE) $(TARGET)

FRC:

include $(TRANS)/Makefile.trans.targ
