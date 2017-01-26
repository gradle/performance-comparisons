package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_190 {
    private final Production61_190 production = new Production61_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}