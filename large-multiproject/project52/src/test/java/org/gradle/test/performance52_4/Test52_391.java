package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_391 {
    private final Production52_391 production = new Production52_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}