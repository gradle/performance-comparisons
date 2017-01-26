package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_205 {
    private final Production74_205 production = new Production74_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}