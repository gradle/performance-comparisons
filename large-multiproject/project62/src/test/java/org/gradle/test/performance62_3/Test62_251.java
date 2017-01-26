package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_251 {
    private final Production62_251 production = new Production62_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}