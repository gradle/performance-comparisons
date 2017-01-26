package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_422 {
    private final Production62_422 production = new Production62_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}