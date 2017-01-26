package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_30 {
    private final Production62_30 production = new Production62_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}