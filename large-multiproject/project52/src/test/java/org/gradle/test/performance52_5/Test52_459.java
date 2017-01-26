package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_459 {
    private final Production52_459 production = new Production52_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}