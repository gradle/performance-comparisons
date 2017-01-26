package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_478 {
    private final Production52_478 production = new Production52_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}