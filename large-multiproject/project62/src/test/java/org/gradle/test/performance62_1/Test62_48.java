package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_48 {
    private final Production62_48 production = new Production62_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}