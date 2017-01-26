package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_92 {
    private final Production61_92 production = new Production61_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}