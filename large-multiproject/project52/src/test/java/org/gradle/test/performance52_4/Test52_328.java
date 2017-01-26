package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_328 {
    private final Production52_328 production = new Production52_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}