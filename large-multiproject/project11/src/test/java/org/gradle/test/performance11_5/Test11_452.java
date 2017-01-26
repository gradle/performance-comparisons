package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_452 {
    private final Production11_452 production = new Production11_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}