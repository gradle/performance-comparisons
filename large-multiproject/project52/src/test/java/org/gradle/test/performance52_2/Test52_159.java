package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_159 {
    private final Production52_159 production = new Production52_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}