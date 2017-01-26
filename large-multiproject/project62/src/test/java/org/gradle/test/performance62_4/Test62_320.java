package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_320 {
    private final Production62_320 production = new Production62_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}