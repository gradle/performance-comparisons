package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_395 {
    private final Production61_395 production = new Production61_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}