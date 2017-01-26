package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_10 {
    private final Production61_10 production = new Production61_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}