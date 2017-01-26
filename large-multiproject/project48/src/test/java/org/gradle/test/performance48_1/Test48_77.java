package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_77 {
    private final Production48_77 production = new Production48_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}