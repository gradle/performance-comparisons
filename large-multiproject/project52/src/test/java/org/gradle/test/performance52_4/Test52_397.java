package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_397 {
    private final Production52_397 production = new Production52_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}