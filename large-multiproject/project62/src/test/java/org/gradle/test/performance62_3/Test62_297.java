package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_297 {
    private final Production62_297 production = new Production62_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}