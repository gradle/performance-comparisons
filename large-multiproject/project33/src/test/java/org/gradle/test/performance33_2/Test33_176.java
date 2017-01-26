package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_176 {
    private final Production33_176 production = new Production33_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}