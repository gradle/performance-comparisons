package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_330 {
    private final Production61_330 production = new Production61_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}