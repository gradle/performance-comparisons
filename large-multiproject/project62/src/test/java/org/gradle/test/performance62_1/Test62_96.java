package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_96 {
    private final Production62_96 production = new Production62_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}