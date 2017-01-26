package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_33 {
    private final Production4_33 production = new Production4_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}