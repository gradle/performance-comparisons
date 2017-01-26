package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_42 {
    private final Production62_42 production = new Production62_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}