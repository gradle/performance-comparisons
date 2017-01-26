package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_476 {
    private final Production62_476 production = new Production62_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}