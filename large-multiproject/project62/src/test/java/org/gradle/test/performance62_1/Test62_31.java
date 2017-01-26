package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_31 {
    private final Production62_31 production = new Production62_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}