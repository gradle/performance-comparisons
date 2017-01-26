package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_382 {
    private final Production61_382 production = new Production61_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}