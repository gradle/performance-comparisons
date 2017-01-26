package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_322 {
    private final Production62_322 production = new Production62_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}