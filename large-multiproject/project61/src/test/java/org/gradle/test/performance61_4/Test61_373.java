package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_373 {
    private final Production61_373 production = new Production61_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}