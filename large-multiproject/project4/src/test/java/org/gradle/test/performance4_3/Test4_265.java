package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_265 {
    private final Production4_265 production = new Production4_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}