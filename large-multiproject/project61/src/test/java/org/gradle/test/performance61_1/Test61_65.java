package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_65 {
    private final Production61_65 production = new Production61_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}