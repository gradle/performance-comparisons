package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_46 {
    private final Production62_46 production = new Production62_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}