package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_143 {
    private final Production61_143 production = new Production61_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}