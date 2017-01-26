package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_221 {
    private final Production11_221 production = new Production11_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}