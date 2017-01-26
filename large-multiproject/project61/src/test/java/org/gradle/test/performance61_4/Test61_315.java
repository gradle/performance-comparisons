package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_315 {
    private final Production61_315 production = new Production61_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}