package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_381 {
    private final Production11_381 production = new Production11_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}