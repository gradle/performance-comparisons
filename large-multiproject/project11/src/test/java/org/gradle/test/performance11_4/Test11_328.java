package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_328 {
    private final Production11_328 production = new Production11_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}