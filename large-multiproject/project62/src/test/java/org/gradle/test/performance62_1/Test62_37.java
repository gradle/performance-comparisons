package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_37 {
    private final Production62_37 production = new Production62_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}