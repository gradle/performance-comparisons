package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_238 {
    private final Production62_238 production = new Production62_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}