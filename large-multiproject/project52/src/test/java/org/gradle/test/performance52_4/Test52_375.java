package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_375 {
    private final Production52_375 production = new Production52_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}