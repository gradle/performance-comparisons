package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_364 {
    private final Production61_364 production = new Production61_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}