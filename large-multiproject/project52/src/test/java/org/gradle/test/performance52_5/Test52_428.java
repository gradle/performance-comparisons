package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_428 {
    private final Production52_428 production = new Production52_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}