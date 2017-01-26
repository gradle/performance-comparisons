package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_4 {
    private final Production62_4 production = new Production62_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}