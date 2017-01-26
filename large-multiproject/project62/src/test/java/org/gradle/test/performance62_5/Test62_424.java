package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_424 {
    private final Production62_424 production = new Production62_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}