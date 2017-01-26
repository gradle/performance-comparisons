package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_359 {
    private final Production33_359 production = new Production33_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}