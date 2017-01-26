package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_158 {
    private final Production33_158 production = new Production33_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}