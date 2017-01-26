package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_292 {
    private final Production52_292 production = new Production52_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}