package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_75 {
    private final Production61_75 production = new Production61_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}