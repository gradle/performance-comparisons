package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_212 {
    private final Production62_212 production = new Production62_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}