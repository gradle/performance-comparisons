package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_60 {
    private final Production62_60 production = new Production62_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}