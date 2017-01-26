package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_290 {
    private final Production61_290 production = new Production61_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}