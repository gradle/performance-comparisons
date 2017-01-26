package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_351 {
    private final Production59_351 production = new Production59_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}