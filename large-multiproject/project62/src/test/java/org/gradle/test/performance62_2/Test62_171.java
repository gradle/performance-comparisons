package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_171 {
    private final Production62_171 production = new Production62_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}