package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_191 {
    private final Production62_191 production = new Production62_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}