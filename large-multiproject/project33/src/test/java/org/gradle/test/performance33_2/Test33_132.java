package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_132 {
    private final Production33_132 production = new Production33_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}