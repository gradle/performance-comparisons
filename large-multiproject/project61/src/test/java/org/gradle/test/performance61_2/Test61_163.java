package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_163 {
    private final Production61_163 production = new Production61_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}