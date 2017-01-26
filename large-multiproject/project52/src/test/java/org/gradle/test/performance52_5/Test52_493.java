package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_493 {
    private final Production52_493 production = new Production52_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}