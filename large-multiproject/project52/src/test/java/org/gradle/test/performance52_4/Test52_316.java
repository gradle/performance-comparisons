package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_316 {
    private final Production52_316 production = new Production52_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}