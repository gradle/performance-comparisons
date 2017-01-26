package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_216 {
    private final Production62_216 production = new Production62_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}