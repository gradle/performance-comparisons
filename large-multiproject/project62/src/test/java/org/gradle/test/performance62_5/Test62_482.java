package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_482 {
    private final Production62_482 production = new Production62_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}