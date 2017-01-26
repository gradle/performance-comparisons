package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_238 {
    private final Production4_238 production = new Production4_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}