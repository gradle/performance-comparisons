package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_466 {
    private final Production61_466 production = new Production61_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}