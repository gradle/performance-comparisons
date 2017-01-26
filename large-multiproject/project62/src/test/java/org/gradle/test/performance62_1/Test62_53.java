package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_53 {
    private final Production62_53 production = new Production62_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}