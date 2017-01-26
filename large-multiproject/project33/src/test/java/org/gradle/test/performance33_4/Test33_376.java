package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_376 {
    private final Production33_376 production = new Production33_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}