package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_473 {
    private final Production11_473 production = new Production11_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}