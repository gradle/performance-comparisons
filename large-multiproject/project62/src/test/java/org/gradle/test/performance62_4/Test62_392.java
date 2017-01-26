package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_392 {
    private final Production62_392 production = new Production62_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}