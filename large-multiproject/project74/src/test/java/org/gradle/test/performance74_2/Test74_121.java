package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_121 {
    private final Production74_121 production = new Production74_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}