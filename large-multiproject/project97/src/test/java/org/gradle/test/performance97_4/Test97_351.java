package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_351 {
    private final Production97_351 production = new Production97_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}