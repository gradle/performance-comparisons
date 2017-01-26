package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_477 {
    private final Production61_477 production = new Production61_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}