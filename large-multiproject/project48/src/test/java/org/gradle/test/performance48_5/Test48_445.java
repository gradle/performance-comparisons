package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_445 {
    private final Production48_445 production = new Production48_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}