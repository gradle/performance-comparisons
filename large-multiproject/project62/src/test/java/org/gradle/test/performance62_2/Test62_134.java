package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_134 {
    private final Production62_134 production = new Production62_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}