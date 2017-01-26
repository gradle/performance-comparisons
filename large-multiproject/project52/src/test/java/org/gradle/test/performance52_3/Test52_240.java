package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_240 {
    private final Production52_240 production = new Production52_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}