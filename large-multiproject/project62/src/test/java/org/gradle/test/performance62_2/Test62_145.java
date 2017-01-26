package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_145 {
    private final Production62_145 production = new Production62_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}