package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_490 {
    private final Production52_490 production = new Production52_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}