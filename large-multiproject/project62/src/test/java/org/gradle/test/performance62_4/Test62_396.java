package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_396 {
    private final Production62_396 production = new Production62_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}