package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_343 {
    private final Production62_343 production = new Production62_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}