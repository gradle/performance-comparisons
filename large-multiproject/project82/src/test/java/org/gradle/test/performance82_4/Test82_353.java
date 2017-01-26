package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_353 {
    private final Production82_353 production = new Production82_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}