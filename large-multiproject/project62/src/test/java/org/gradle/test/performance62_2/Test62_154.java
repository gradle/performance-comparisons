package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_154 {
    private final Production62_154 production = new Production62_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}