package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_290 {
    private final Production11_290 production = new Production11_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}