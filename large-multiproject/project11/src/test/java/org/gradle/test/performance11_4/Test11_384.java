package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_384 {
    private final Production11_384 production = new Production11_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}