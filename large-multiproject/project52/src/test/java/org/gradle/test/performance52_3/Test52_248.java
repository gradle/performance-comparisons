package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_248 {
    private final Production52_248 production = new Production52_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}