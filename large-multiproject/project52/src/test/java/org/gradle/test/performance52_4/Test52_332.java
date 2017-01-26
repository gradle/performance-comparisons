package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_332 {
    private final Production52_332 production = new Production52_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}