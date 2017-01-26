package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_271 {
    private final Production11_271 production = new Production11_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}