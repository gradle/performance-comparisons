package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_437 {
    private final Production61_437 production = new Production61_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}