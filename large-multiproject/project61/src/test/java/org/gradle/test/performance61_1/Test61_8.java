package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_8 {
    private final Production61_8 production = new Production61_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}