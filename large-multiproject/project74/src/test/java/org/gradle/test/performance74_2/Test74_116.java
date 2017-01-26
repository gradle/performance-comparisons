package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_116 {
    private final Production74_116 production = new Production74_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}