package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_419 {
    private final Production62_419 production = new Production62_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}