package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_96 {
    private final Production61_96 production = new Production61_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}