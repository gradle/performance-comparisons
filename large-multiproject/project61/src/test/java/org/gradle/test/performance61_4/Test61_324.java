package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_324 {
    private final Production61_324 production = new Production61_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}