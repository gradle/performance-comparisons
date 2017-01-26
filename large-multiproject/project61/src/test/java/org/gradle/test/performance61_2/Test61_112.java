package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_112 {
    private final Production61_112 production = new Production61_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}