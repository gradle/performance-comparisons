package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_99 {
    private final Production61_99 production = new Production61_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}