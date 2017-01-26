package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_415 {
    private final Production61_415 production = new Production61_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}