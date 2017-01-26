package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_351 {
    private final Production91_351 production = new Production91_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}