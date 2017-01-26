package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_101 {
    private final Production33_101 production = new Production33_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}