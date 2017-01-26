package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_89 {
    private final Production62_89 production = new Production62_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}