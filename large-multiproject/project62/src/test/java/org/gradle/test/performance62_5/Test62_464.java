package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_464 {
    private final Production62_464 production = new Production62_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}