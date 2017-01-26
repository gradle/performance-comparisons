package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_481 {
    private final Production62_481 production = new Production62_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}