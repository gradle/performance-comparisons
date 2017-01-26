package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_138 {
    private final Production61_138 production = new Production61_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}