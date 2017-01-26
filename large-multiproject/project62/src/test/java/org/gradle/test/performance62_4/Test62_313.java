package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_313 {
    private final Production62_313 production = new Production62_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}