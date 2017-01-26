package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_241 {
    private final Production4_241 production = new Production4_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}