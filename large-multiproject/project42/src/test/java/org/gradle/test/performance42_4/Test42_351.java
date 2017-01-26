package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_351 {
    private final Production42_351 production = new Production42_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}