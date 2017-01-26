package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_337 {
    private final Production62_337 production = new Production62_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}