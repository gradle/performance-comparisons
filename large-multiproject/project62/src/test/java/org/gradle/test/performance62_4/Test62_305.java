package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_305 {
    private final Production62_305 production = new Production62_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}