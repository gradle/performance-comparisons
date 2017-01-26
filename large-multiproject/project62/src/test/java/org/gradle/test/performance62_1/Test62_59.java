package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_59 {
    private final Production62_59 production = new Production62_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}