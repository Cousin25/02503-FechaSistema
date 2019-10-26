/* 
 * Copyright 2019 ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com
 */
public class Main {

    public static final Locale LCL = new Locale("es", "ES");
    public static final DateFormat DF = DateFormat.getDateInstance(DateFormat.LONG, LCL);

    //public static final SimpleDateFormat SDF = new SimpleDateFormat();
    //public static final String PATRON_FECHA_CORTA = "dd/MM/yyyy";
    public static void main(String[] args) {
        Date d = new Date();
        System.out.print("La fecha del sistema es: ");
        System.out.println(DF.format(d));

        //SDF.applyPattern(PATRON_FECHA_CORTA);

        //System.out.println(SDF.format(d.getTime()));

    }

}
