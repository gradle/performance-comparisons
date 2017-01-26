package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_309 {
    private final Production61_309 production = new Production61_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}