package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_490 {
    private final Production33_490 production = new Production33_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}