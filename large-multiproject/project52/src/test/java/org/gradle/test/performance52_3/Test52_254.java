package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_254 {
    private final Production52_254 production = new Production52_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}