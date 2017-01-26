package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_208 {
    private final Production74_208 production = new Production74_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}