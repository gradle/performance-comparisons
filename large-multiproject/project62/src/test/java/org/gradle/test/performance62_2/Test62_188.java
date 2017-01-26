package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_188 {
    private final Production62_188 production = new Production62_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}