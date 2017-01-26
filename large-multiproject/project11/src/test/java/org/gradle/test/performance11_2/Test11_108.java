package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_108 {
    private final Production11_108 production = new Production11_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}