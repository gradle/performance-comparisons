package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_368 {
    private final Production52_368 production = new Production52_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}