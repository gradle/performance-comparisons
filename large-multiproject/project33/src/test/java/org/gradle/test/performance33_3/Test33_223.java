package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_223 {
    private final Production33_223 production = new Production33_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}