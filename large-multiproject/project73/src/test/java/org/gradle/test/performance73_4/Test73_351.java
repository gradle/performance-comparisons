package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_351 {
    private final Production73_351 production = new Production73_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}