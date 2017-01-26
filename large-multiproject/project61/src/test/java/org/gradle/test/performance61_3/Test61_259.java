package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_259 {
    private final Production61_259 production = new Production61_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}