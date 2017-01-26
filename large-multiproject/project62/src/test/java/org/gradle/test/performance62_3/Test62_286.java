package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_286 {
    private final Production62_286 production = new Production62_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}