package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_397 {
    private final Production11_397 production = new Production11_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}