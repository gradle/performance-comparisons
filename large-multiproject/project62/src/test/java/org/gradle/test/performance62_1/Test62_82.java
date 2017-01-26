package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_82 {
    private final Production62_82 production = new Production62_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}