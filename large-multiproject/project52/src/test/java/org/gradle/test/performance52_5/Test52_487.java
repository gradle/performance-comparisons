package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_487 {
    private final Production52_487 production = new Production52_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}