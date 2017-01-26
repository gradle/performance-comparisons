package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_29 {
    private final Production62_29 production = new Production62_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}