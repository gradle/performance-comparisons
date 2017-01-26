package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_19 {
    private final Production62_19 production = new Production62_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}