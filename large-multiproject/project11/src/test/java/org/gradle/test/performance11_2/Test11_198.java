package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_198 {
    private final Production11_198 production = new Production11_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}