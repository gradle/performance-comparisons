package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_215 {
    private final Production62_215 production = new Production62_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}