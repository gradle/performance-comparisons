package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_390 {
    private final Production61_390 production = new Production61_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}