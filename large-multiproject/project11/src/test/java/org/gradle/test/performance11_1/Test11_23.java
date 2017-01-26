package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_23 {
    private final Production11_23 production = new Production11_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}