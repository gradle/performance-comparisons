package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_374 {
    private final Production52_374 production = new Production52_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}