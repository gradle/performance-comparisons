package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_358 {
    private final Production61_358 production = new Production61_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}