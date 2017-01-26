package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_495 {
    private final Production61_495 production = new Production61_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}