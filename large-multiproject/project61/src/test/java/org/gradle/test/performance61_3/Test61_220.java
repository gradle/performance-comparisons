package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_220 {
    private final Production61_220 production = new Production61_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}