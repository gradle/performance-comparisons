package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_73 {
    private final Production48_73 production = new Production48_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}