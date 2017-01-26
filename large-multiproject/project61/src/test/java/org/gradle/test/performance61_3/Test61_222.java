package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_222 {
    private final Production61_222 production = new Production61_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}