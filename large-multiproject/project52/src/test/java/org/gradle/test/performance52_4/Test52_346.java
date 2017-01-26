package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_346 {
    private final Production52_346 production = new Production52_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}