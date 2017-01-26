package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_153 {
    private final Production33_153 production = new Production33_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}