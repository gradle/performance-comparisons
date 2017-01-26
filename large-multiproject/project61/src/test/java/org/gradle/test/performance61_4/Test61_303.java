package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_303 {
    private final Production61_303 production = new Production61_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}