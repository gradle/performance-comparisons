package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_232 {
    private final Production74_232 production = new Production74_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}