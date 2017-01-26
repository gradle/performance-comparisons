package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_36 {
    private final Production61_36 production = new Production61_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}