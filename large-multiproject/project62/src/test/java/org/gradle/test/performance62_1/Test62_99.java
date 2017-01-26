package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_99 {
    private final Production62_99 production = new Production62_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}