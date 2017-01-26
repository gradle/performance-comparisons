package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_198 {
    private final Production33_198 production = new Production33_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}