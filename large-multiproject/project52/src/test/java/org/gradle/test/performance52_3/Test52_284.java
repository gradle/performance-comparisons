package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_284 {
    private final Production52_284 production = new Production52_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}