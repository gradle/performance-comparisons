package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_90 {
    private final Production61_90 production = new Production61_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}