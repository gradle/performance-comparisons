package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_316 {
    private final Production33_316 production = new Production33_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}