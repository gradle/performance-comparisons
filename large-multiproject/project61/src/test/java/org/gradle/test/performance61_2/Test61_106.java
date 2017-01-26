package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_106 {
    private final Production61_106 production = new Production61_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}