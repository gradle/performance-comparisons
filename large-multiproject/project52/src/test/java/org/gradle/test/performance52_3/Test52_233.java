package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_233 {
    private final Production52_233 production = new Production52_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}