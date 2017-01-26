package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_362 {
    private final Production61_362 production = new Production61_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}