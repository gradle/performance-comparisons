package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_335 {
    private final Production33_335 production = new Production33_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}