package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_293 {
    private final Production62_293 production = new Production62_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}