package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_228 {
    private final Production62_228 production = new Production62_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}