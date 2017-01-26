package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_466 {
    private final Production62_466 production = new Production62_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}