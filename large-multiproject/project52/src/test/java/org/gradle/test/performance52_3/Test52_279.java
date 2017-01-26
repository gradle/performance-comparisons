package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_279 {
    private final Production52_279 production = new Production52_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}