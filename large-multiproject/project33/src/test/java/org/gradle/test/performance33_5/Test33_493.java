package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_493 {
    private final Production33_493 production = new Production33_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}