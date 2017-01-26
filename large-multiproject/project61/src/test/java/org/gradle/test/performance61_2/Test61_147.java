package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_147 {
    private final Production61_147 production = new Production61_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}