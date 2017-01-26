package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_397 {
    private final Production33_397 production = new Production33_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}