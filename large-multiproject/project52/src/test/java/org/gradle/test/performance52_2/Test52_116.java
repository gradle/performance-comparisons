package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_116 {
    private final Production52_116 production = new Production52_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}