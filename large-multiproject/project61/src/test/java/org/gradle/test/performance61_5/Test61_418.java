package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_418 {
    private final Production61_418 production = new Production61_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}