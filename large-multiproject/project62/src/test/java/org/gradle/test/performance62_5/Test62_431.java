package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_431 {
    private final Production62_431 production = new Production62_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}