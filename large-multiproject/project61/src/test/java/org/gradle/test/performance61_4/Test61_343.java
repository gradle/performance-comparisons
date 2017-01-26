package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_343 {
    private final Production61_343 production = new Production61_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}