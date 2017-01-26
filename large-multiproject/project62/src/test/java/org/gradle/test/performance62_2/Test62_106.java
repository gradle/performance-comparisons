package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_106 {
    private final Production62_106 production = new Production62_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}