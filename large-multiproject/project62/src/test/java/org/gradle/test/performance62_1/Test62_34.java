package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_34 {
    private final Production62_34 production = new Production62_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}