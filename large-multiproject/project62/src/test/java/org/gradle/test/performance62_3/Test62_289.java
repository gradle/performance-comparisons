package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_289 {
    private final Production62_289 production = new Production62_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}