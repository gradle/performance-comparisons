package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_258 {
    private final Production11_258 production = new Production11_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}