package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_252 {
    private final Production52_252 production = new Production52_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}