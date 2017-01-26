package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_50 {
    private final Production52_50 production = new Production52_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}