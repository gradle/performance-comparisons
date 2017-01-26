package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_115 {
    private final Production11_115 production = new Production11_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}