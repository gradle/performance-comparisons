package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_344 {
    private final Production33_344 production = new Production33_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}