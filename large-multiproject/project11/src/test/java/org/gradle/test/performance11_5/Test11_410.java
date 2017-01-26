package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_410 {
    private final Production11_410 production = new Production11_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}