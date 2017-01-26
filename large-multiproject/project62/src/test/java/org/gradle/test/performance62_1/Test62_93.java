package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_93 {
    private final Production62_93 production = new Production62_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}