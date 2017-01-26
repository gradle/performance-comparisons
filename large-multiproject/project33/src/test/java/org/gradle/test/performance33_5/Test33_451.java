package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_451 {
    private final Production33_451 production = new Production33_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}