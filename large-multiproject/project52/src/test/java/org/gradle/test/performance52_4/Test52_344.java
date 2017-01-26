package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_344 {
    private final Production52_344 production = new Production52_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}