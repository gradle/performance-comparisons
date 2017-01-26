package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_390 {
    private final Production62_390 production = new Production62_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}