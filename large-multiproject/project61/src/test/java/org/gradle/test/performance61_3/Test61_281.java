package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_281 {
    private final Production61_281 production = new Production61_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}