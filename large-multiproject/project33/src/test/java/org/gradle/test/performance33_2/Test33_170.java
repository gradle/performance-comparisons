package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_170 {
    private final Production33_170 production = new Production33_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}