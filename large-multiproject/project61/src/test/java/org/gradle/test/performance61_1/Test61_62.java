package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_62 {
    private final Production61_62 production = new Production61_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}