package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_246 {
    private final Production61_246 production = new Production61_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}