package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_214 {
    private final Production61_214 production = new Production61_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}