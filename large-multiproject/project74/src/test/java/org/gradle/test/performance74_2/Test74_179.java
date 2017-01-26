package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_179 {
    private final Production74_179 production = new Production74_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}