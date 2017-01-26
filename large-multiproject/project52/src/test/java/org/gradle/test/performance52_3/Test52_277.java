package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_277 {
    private final Production52_277 production = new Production52_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}