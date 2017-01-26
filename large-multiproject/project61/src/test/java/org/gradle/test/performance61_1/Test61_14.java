package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_14 {
    private final Production61_14 production = new Production61_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}