package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_260 {
    private final Production62_260 production = new Production62_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}