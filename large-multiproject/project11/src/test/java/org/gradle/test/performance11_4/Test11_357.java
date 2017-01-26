package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_357 {
    private final Production11_357 production = new Production11_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}