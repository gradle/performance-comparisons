package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_442 {
    private final Production61_442 production = new Production61_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}