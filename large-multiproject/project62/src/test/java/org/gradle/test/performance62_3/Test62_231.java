package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_231 {
    private final Production62_231 production = new Production62_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}