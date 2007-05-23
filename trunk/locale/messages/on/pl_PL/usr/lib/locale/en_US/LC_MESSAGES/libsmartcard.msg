$ 
$ CDDL HEADER START
$ 
$ The contents of this file are subject to the terms of the
$ Common Development and Distribution License (the "License").
$ You may not use this file except in compliance with the License.
$ 
$ You can obtain a copy of the license at src/OPENSOLARIS.LICENSE
$ or http://www.opensolaris.org/os/licensing.
$ See the License for the specific language governing permissions
$ and limitations under the License.
$ 
$ When distributing Covered Code, include this CDDL HEADER in each
$ file and include the License file at src/OPENSOLARIS.LICENSE.
$ If applicable, add the following below this CDDL HEADER, with the
$ fields enclosed by brackets "[]" replaced with your own identifying
$ information: Portions Copyright [yyyy] [name of copyright owner]
$ 
$ CDDL HEADER END
$ 
$ Copyright 1999-2002 Sun Microsystems, Inc.  All rights reserved.
$ Use is subject to license terms.
$
$ ident	"@(#)libsmartcard.msg	1.5	02/02/24 SMI"
$
$
$ ----- NOTE FOR TRANSLATORS -----
$
$ These messages are made available in libsmartcard.so for SCF_strerror()
$ and OCF_strerror(), APIs similar in purpose to the libc strerror() function.
$ These messages all describe various error/status codes, and should be
$ terse messages expected in logfiles or for developers/administrators.

$ Set 1 contains messages for the SCF interfaces, via SCF_strerror().
$set 1

$ SCF_STATUS_SUCCESS
1 Success

$ SCF_STATUS_FAILED
2 Internal/general error

$ SCF_STATUS_BADERRORCODE
3 Invalid error code

$ SCF_STATUS_BADARGS
4 Invalid argument supplied

$ SCF_STATUS_BADHANDLE
5 The object handle is not valid

$ SCF_STATUS_BADTERMINAL
6 Unknown terminal name

$ SCF_STATUS_COMMERROR
7 Connection to server lost

$ SCF_STATUS_CARDLOCKED
8 Access denied due to card lock

$ SCF_STATUS_DOUBLELOCK
9 Cannot lock card twice

$ SCF_STATUS_NOCARD
10 No card found in terminal

$ SCF_STATUS_CARDREMOVED
11 The requested card has been removed

$ SCF_STATUS_TIMEOUT
12 Timeout expired

$ SCF_STATUS_NOSPACE
13 Reply APDU too big for buffer

$ SCF_STATUS_UNKNOWNPROPERTY
14 Property name not found

$ SCF_STATUS_NOLISTENER
15 No matching listener found


$ Set 2 contains messages for the OCF interfaces, via ocf_strerror().
$set 2

$ OCF_Success
1 Success

$ OCF_NoCard
2 No Card Present

$ OCF_CardError
3 Error on Card

$ OCF_ReaderError
4 Error on reader

$ OCF_ParameterError
5 An Invalid Parameter was set

$ OCF_OperationTimeout
6 Operation Timed out

$ OCF_ResourceUnavailable
7 Unavailable Resource

$ OCF_CardLocked
8 Card is Locked

$ OCF_DuplicateClient
9 Duplicate Client

$ OCF_DuplicateHandler
10 Duplicate Handler

$ OCF_DuplicateEvent
11 Duplicate Event

$ OCF_VerifyError
12 Verfication failed

$ OCF_PINAlreadySet
13 Pin already set

$ OCF_NoPermission
14 No permission for this operation

$ OCF_UnknownResource
15 Requested resource unknown

$ OCF_EncodingError
16 Encode/Decode error

$ OCF_ServerError
17 Error in communication with server

$ OCF_VersionMismatch
18 Client/Server version mismatch

$ OCF_DoubleLock
19 Already has a lock

$ OCF_Exception
20 Exception from server

$ OCF_NoSuchProperty
21 No such property defined

$ OCF_InvalidClientHandle
22 Invalid client handle

$ OCF_InvalidCardHandle
23 Invalid card handle

$ OCF_InvalidEventHandle
24 Invalid event handle

$ OCF_NoReadersConfigured
25 No readers configured

$ OCF_NoCardsConfigured
26 No cards configured

$ OCF_AuthenticationError
27 Authentication error

$ OCF_AuthenticationFailed
28 Authentication failed

$ OCF_AuthOp
29 Authentication operation

$ OCF_InvalidPin
30 Invalid PIN

$ OCF_InvalidPassword
31 Invalid Password

$ OCF_UnsupportedAuthMech
32 Unsupported authentication

$ OCF_UnsupportedAuthMech
33 Unknown Error
