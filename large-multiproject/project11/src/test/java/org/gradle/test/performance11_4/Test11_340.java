package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_340 {
    private final Production11_340 production = new Production11_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}