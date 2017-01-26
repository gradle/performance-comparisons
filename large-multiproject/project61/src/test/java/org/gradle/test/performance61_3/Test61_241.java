package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_241 {
    private final Production61_241 production = new Production61_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}