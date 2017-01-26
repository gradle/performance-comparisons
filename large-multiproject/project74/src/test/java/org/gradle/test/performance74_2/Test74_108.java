package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_108 {
    private final Production74_108 production = new Production74_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}