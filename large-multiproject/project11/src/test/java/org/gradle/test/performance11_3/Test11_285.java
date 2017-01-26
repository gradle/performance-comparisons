package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_285 {
    private final Production11_285 production = new Production11_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}