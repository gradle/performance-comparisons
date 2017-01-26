package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_25 {
    private final Production62_25 production = new Production62_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}