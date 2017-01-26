package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_86 {
    private final Production52_86 production = new Production52_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}