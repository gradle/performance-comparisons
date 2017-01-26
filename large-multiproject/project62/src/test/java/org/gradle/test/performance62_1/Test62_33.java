package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_33 {
    private final Production62_33 production = new Production62_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}