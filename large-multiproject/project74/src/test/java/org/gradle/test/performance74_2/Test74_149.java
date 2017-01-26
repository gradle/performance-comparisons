package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_149 {
    private final Production74_149 production = new Production74_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}