package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_130 {
    private final Production33_130 production = new Production33_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}