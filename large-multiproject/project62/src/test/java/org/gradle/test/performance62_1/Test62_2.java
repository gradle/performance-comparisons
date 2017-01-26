package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_2 {
    private final Production62_2 production = new Production62_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}