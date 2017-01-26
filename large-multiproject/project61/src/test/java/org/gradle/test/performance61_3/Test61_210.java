package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_210 {
    private final Production61_210 production = new Production61_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}