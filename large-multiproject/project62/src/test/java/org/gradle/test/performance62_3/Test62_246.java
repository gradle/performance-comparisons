package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_246 {
    private final Production62_246 production = new Production62_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}