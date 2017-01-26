package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_51 {
    private final Production62_51 production = new Production62_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}