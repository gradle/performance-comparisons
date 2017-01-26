package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_166 {
    private final Production62_166 production = new Production62_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}