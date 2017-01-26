package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_300 {
    private final Production62_300 production = new Production62_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}