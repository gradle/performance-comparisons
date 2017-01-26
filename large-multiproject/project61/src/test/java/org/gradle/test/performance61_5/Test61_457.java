package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_457 {
    private final Production61_457 production = new Production61_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}