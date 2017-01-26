package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_28 {
    private final Production61_28 production = new Production61_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}