package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_365 {
    private final Production62_365 production = new Production62_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}