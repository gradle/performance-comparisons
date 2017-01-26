package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_272 {
    private final Production11_272 production = new Production11_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}