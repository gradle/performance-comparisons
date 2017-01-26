package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_304 {
    private final Production62_304 production = new Production62_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}