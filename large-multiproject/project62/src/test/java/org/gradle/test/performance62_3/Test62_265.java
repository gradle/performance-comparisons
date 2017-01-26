package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_265 {
    private final Production62_265 production = new Production62_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}