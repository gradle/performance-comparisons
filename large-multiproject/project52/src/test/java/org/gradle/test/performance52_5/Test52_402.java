package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_402 {
    private final Production52_402 production = new Production52_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}