package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_66 {
    private final Production62_66 production = new Production62_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}