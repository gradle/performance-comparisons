package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_203 {
    private final Production62_203 production = new Production62_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}