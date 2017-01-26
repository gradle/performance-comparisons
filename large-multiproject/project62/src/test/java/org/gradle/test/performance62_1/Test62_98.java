package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_98 {
    private final Production62_98 production = new Production62_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}