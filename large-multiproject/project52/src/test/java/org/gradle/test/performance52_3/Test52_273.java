package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_273 {
    private final Production52_273 production = new Production52_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}