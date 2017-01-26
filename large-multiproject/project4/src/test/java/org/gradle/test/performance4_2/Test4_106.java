package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_106 {
    private final Production4_106 production = new Production4_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}