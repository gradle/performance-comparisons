package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_484 {
    private final Production61_484 production = new Production61_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}