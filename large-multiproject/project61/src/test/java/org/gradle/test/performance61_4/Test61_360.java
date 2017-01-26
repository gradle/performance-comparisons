package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_360 {
    private final Production61_360 production = new Production61_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}