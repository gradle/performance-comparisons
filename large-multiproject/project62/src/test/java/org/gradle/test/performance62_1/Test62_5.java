package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_5 {
    private final Production62_5 production = new Production62_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}