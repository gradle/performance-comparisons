package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_71 {
    private final Production48_71 production = new Production48_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}