package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_310 {
    private final Production62_310 production = new Production62_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}