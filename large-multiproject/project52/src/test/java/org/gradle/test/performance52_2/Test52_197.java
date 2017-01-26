package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_197 {
    private final Production52_197 production = new Production52_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}