package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_50 {
    private final Production33_50 production = new Production33_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}