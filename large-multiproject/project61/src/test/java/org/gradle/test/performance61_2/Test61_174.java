package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_174 {
    private final Production61_174 production = new Production61_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}