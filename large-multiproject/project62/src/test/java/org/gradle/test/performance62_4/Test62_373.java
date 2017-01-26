package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_373 {
    private final Production62_373 production = new Production62_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}