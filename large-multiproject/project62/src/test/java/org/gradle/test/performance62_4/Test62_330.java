package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_330 {
    private final Production62_330 production = new Production62_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}