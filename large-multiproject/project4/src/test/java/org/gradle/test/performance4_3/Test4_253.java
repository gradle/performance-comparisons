package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_253 {
    private final Production4_253 production = new Production4_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}