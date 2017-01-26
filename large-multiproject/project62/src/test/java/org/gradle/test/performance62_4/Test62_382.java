package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_382 {
    private final Production62_382 production = new Production62_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}