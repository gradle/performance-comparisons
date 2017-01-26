package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_280 {
    private final Production52_280 production = new Production52_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}