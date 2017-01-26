package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_234 {
    private final Production82_234 production = new Production82_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}