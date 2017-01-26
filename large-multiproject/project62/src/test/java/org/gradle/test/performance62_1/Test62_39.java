package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_39 {
    private final Production62_39 production = new Production62_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}