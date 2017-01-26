package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_350 {
    private final Production61_350 production = new Production61_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}