package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_389 {
    private final Production52_389 production = new Production52_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}