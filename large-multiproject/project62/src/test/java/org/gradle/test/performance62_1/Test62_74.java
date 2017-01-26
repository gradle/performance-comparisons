package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_74 {
    private final Production62_74 production = new Production62_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}