package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_476 {
    private final Production61_476 production = new Production61_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}