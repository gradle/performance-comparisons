package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_109 {
    private final Production62_109 production = new Production62_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}