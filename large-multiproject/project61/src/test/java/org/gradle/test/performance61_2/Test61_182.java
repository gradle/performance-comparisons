package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_182 {
    private final Production61_182 production = new Production61_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}