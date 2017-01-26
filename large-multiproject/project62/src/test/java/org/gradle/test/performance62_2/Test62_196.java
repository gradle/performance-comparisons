package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_196 {
    private final Production62_196 production = new Production62_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}