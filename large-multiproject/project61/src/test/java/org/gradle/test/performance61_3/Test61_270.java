package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_270 {
    private final Production61_270 production = new Production61_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}