package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_72 {
    private final Production62_72 production = new Production62_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}