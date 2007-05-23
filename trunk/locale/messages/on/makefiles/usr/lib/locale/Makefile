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
#ident  "@(#)Makefile"
#

# include global definitions
include $(SRC)/src/messages/Makefile.trans

COMMON_SUBDIRS= $(TARG_LANGUAGE)
sparc_SUBDIRS=
i386_SUBDIRS=
SUBDIRS=	$(COMMON_SUBDIRS) $($(MACH)_SUBDIRS)
SUB_LOC_CLEAN = $(TARG_LOCALE)

all:=		TARGET= all
install:=	TARGET= install
clean:=		TARGET= clean
clobber:=	TARGET= clobber
lint:=		TARGET= lint

.KEEP_STATE:

all install lint: $(SUBDIRS)

clean clobber:
	$(RM) -r $(SUB_LOC_CLEAN)

$(SUBDIRS): FRC
	-@cd $@; pwd; $(MAKE) $(TARGET)

FRC:

include $(TRANS)/Makefile.trans.targ
