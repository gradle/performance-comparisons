package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_94 {
    private final Production33_94 production = new Production33_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}