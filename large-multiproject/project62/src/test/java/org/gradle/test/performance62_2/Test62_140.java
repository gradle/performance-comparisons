package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_140 {
    private final Production62_140 production = new Production62_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}