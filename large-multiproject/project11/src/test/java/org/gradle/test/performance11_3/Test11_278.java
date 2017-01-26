package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_278 {
    private final Production11_278 production = new Production11_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}