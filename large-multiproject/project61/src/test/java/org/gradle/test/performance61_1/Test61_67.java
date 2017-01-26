package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_67 {
    private final Production61_67 production = new Production61_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}