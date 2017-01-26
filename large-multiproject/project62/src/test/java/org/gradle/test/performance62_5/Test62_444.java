package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_444 {
    private final Production62_444 production = new Production62_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}