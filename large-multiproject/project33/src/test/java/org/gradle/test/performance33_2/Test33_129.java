package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_129 {
    private final Production33_129 production = new Production33_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}