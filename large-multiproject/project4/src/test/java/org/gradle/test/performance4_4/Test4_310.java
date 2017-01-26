package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_310 {
    private final Production4_310 production = new Production4_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}