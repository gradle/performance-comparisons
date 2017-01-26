package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_460 {
    private final Production32_460 production = new Production32_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}