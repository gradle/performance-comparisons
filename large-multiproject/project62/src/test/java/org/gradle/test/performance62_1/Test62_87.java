package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_87 {
    private final Production62_87 production = new Production62_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}