package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_450 {
    private final Production61_450 production = new Production61_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}