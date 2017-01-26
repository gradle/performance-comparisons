package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_325 {
    private final Production61_325 production = new Production61_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}