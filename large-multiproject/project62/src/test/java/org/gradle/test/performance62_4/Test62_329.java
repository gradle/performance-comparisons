package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_329 {
    private final Production62_329 production = new Production62_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}