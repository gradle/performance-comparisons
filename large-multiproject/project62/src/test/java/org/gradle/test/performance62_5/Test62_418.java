package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_418 {
    private final Production62_418 production = new Production62_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}