package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_465 {
    private final Production62_465 production = new Production62_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}