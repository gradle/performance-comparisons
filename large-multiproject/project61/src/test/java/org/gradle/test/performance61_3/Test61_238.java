package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_238 {
    private final Production61_238 production = new Production61_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}