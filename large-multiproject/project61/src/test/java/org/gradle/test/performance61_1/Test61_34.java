package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_34 {
    private final Production61_34 production = new Production61_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}