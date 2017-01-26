package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_424 {
    private final Production61_424 production = new Production61_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}