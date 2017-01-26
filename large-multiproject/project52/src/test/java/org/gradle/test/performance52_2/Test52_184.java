package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_184 {
    private final Production52_184 production = new Production52_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}