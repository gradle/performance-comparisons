package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_385 {
    private final Production52_385 production = new Production52_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}