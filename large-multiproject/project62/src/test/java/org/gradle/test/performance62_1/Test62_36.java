package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_36 {
    private final Production62_36 production = new Production62_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}