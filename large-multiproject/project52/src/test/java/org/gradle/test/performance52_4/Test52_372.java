package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_372 {
    private final Production52_372 production = new Production52_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}