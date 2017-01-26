package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_260 {
    private final Production61_260 production = new Production61_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}