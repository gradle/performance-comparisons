package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_500 {
    private final Production61_500 production = new Production61_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}