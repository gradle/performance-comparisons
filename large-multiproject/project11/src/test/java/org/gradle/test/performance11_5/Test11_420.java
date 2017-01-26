package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_420 {
    private final Production11_420 production = new Production11_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}