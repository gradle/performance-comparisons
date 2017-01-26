package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_435 {
    private final Production62_435 production = new Production62_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}