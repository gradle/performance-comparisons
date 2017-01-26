package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_248 {
    private final Production33_248 production = new Production33_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}