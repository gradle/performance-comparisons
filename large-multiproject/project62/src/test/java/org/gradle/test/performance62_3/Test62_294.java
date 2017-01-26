package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_294 {
    private final Production62_294 production = new Production62_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}