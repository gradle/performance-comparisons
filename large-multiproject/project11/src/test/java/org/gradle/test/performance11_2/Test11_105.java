package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_105 {
    private final Production11_105 production = new Production11_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}