package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_85 {
    private final Production82_85 production = new Production82_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}