package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_351 {
    private final Production79_351 production = new Production79_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}