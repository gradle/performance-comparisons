package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_105 {
    private final Production74_105 production = new Production74_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}