package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_434 {
    private final Production61_434 production = new Production61_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}