package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_439 {
    private final Production52_439 production = new Production52_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}