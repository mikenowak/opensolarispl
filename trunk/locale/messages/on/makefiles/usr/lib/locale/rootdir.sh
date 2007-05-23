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

# This script is to change installation destination of files
# to short name locale directories
# Once default destination becomes long (full) name locale
# directories, this script and reference to this can be removed.

pwd | sed \
	-e 's:.*/src/messages/[^/][^/]*/makefiles/::' \
	-e 's:/de_DE.ISO8859-1/:/de/:' \
	-e 's:/de_DE.UTF-8/:/de.UTF-8/:' \
	-e 's:/es_ES.ISO8859-1/:/es/:' \
	-e 's:/es_ES.UTF-8/:/es.UTF-8/:' \
	-e 's:/fr_FR.ISO8859-1/:/fr/:' \
	-e 's:/fr_FR.UTF-8/:/fr.UTF-8/:' \
	-e 's:/it_IT.ISO8859-1/:/it/:' \
	-e 's:/it_IT.UTF-8/:/it.UTF-8/:' \
	-e 's:/ja_JP.eucJP/LC_MESSAGES:/ja/LC_MESSAGES:' \
	-e 's:/ko_KR.EUC/:/ko/:' \
	-e 's:/sv_SE.ISO8859-1/:/sv/:' \
	-e 's:/sv_SE.UTF-8/:/sv.UTF-8/:' \
	-e 's:/zh_CN.EUC/:/zh/:' \
	-e 's:/zh_TW.EUC/:/zh_TW/:' \
| cat

exit 0
