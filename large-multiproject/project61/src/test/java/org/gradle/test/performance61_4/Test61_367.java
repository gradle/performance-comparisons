package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_367 {
    private final Production61_367 production = new Production61_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}