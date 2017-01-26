package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_443 {
    private final Production52_443 production = new Production52_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}