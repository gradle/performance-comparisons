package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_45 {
    private final Production48_45 production = new Production48_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}