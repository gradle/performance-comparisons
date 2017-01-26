package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_361 {
    private final Production61_361 production = new Production61_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}