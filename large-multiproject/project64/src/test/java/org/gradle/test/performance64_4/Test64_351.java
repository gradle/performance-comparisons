package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_351 {
    private final Production64_351 production = new Production64_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}