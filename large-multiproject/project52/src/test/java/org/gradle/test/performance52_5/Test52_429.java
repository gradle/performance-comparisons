package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_429 {
    private final Production52_429 production = new Production52_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}