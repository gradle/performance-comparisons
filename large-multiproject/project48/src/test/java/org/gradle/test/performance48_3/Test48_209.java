package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_209 {
    private final Production48_209 production = new Production48_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}