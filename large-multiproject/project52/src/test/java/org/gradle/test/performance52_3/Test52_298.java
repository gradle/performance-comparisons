package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_298 {
    private final Production52_298 production = new Production52_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}