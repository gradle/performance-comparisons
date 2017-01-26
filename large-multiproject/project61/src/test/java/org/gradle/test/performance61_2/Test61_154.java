package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_154 {
    private final Production61_154 production = new Production61_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}