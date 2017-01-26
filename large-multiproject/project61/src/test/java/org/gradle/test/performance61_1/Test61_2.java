package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_2 {
    private final Production61_2 production = new Production61_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}