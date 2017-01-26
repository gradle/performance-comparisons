package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_351 {
    private final Production19_351 production = new Production19_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}