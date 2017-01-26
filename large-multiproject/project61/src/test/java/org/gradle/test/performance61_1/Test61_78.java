package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_78 {
    private final Production61_78 production = new Production61_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}