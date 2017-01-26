package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_32 {
    private final Production11_32 production = new Production11_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}