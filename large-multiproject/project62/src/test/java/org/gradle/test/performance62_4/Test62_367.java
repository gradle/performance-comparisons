package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_367 {
    private final Production62_367 production = new Production62_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}