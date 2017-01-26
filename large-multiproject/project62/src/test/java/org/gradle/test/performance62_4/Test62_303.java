package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_303 {
    private final Production62_303 production = new Production62_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}