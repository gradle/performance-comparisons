package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_268 {
    private final Production61_268 production = new Production61_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}