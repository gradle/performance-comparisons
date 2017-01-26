package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_351 {
    private final Production39_351 production = new Production39_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}