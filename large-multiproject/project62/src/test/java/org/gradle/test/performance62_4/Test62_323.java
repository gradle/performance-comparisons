package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_323 {
    private final Production62_323 production = new Production62_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}