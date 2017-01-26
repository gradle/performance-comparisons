package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_104 {
    private final Production61_104 production = new Production61_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}