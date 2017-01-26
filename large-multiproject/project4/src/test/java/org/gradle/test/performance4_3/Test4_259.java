package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_259 {
    private final Production4_259 production = new Production4_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}