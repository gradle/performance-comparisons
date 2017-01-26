package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_35 {
    private final Production62_35 production = new Production62_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}