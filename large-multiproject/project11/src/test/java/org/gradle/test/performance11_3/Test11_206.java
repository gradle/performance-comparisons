package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_206 {
    private final Production11_206 production = new Production11_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}