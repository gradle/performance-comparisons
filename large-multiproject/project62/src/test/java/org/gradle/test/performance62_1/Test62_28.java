package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_28 {
    private final Production62_28 production = new Production62_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}