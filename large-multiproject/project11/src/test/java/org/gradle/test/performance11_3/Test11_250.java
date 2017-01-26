package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_250 {
    private final Production11_250 production = new Production11_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}