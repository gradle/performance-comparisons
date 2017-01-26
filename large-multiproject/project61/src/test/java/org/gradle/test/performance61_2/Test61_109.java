package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_109 {
    private final Production61_109 production = new Production61_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}