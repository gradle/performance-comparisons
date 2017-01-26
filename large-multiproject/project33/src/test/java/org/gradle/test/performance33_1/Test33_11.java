package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_11 {
    private final Production33_11 production = new Production33_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}