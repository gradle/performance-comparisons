package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_100 {
    private final Production61_100 production = new Production61_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}