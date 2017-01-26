package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_168 {
    private final Production62_168 production = new Production62_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}