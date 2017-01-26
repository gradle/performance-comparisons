package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_335 {
    private final Production52_335 production = new Production52_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}