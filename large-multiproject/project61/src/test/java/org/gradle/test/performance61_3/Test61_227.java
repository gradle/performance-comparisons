package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_227 {
    private final Production61_227 production = new Production61_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}