package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_131 {
    private final Production62_131 production = new Production62_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}