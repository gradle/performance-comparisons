package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_350 {
    private final Production62_350 production = new Production62_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}