package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_39 {
    private final Production61_39 production = new Production61_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}