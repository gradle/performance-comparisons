package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_419 {
    private final Production61_419 production = new Production61_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}