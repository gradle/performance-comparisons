package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_216 {
    private final Production61_216 production = new Production61_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}