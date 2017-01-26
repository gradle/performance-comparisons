package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_129 {
    private final Production74_129 production = new Production74_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}