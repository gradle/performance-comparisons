package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_397 {
    private final Production34_397 production = new Production34_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}