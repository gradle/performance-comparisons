package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_81 {
    private final Production61_81 production = new Production61_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}