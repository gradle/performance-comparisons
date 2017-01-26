package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_179 {
    private final Production11_179 production = new Production11_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}