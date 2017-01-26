package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_371 {
    private final Production62_371 production = new Production62_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}