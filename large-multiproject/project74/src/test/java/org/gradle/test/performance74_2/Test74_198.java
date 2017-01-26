package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_198 {
    private final Production74_198 production = new Production74_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}