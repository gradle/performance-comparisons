package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_253 {
    private final Production62_253 production = new Production62_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}