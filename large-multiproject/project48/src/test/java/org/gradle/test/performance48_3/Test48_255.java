package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_255 {
    private final Production48_255 production = new Production48_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}