package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_62 {
    private final Production62_62 production = new Production62_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}