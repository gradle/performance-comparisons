package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_53 {
    private final Production61_53 production = new Production61_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}