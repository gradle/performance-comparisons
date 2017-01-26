package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_351 {
    private final Production51_351 production = new Production51_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}