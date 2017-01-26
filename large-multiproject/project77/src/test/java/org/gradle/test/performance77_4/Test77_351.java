package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_351 {
    private final Production77_351 production = new Production77_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}