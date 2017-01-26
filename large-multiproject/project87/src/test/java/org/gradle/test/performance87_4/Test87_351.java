package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_351 {
    private final Production87_351 production = new Production87_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}