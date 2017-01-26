package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_397 {
    private final Production19_397 production = new Production19_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}