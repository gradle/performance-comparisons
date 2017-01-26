package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_465 {
    private final Production61_465 production = new Production61_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}