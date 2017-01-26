package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_351 {
    private final Production52_351 production = new Production52_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}