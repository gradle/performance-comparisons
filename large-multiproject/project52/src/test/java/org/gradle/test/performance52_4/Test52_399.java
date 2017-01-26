package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_399 {
    private final Production52_399 production = new Production52_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}