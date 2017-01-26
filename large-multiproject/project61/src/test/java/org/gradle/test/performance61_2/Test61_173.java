package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_173 {
    private final Production61_173 production = new Production61_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}