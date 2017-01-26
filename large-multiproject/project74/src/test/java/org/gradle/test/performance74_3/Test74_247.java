package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_247 {
    private final Production74_247 production = new Production74_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}