package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_141 {
    private final Production52_141 production = new Production52_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}