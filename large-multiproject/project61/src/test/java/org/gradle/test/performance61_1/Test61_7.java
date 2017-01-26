package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_7 {
    private final Production61_7 production = new Production61_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}