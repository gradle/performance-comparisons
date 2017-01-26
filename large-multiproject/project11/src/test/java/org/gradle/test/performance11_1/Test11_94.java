package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_94 {
    private final Production11_94 production = new Production11_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}