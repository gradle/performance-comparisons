package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_251 {
    private final Production61_251 production = new Production61_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}