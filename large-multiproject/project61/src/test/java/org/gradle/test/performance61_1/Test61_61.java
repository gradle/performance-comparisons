package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_61 {
    private final Production61_61 production = new Production61_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}