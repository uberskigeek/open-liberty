/*******************************************************************************
 * Copyright (c) 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package test.wssecfvt.wsstemplates;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2015-10-01T15:37:33.790-05:00
 * Generated source version: 2.6.2
 * 
 */
@WebService(targetNamespace = "http://wsstemplates.wssecfvt.test", name = "WSSTemplates")
@XmlSeeAlso({test.wssecfvt.wsstemplates.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WSSTemplates {

    @WebResult(name = "getVerResponse", targetNamespace = "http://wsstemplates.wssecfvt.test/types", partName = "out")
    @WebMethod
    public test.wssecfvt.wsstemplates.types.GetVerResponse invoke(
        @WebParam(partName = "in", name = "getVer", targetNamespace = "http://wsstemplates.wssecfvt.test/types")
        test.wssecfvt.wsstemplates.types.GetVer in
    );
}
