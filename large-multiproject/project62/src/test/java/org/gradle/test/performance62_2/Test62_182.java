package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_182 {
    private final Production62_182 production = new Production62_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}