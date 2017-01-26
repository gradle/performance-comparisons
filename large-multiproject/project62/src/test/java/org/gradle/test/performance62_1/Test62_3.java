package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_3 {
    private final Production62_3 production = new Production62_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}