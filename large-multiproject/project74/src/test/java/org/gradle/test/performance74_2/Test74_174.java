package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_174 {
    private final Production74_174 production = new Production74_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}