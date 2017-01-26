package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_202 {
    private final Production62_202 production = new Production62_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}