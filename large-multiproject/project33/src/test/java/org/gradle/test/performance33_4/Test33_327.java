package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_327 {
    private final Production33_327 production = new Production33_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}