package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_477 {
    private final Production62_477 production = new Production62_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}