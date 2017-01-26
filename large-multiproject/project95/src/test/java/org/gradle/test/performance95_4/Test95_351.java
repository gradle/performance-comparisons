package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_351 {
    private final Production95_351 production = new Production95_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}