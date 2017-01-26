package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_495 {
    private final Production62_495 production = new Production62_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}