package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_89 {
    private final Production61_89 production = new Production61_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}