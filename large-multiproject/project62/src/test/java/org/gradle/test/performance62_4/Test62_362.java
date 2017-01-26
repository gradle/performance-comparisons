package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_362 {
    private final Production62_362 production = new Production62_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}