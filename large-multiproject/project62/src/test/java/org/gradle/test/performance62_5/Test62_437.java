package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_437 {
    private final Production62_437 production = new Production62_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}