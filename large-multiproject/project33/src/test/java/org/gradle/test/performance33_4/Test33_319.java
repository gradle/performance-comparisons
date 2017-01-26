package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_319 {
    private final Production33_319 production = new Production33_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}