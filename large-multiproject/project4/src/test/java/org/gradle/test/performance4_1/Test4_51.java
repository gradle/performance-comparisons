package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_51 {
    private final Production4_51 production = new Production4_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}