package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_285 {
    private final Production52_285 production = new Production52_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}