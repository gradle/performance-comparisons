package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_458 {
    private final Production62_458 production = new Production62_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}