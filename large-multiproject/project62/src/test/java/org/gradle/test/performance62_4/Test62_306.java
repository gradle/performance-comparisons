package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_306 {
    private final Production62_306 production = new Production62_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}