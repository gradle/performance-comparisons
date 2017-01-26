package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_451 {
    private final Production52_451 production = new Production52_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}