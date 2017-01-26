package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_393 {
    private final Production82_393 production = new Production82_393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}