package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_497 {
    private final Production62_497 production = new Production62_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}