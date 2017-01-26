package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_1 {
    private final Production62_1 production = new Production62_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}