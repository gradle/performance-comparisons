package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_359 {
    private final Production52_359 production = new Production52_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}