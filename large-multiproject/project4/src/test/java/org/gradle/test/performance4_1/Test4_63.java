package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_63 {
    private final Production4_63 production = new Production4_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}