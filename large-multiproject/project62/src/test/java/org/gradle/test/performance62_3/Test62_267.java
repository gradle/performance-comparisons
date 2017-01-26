package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_267 {
    private final Production62_267 production = new Production62_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}