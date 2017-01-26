package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_23 {
    private final Production74_23 production = new Production74_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}