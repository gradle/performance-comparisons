package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_197 {
    private final Production33_197 production = new Production33_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}