package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_400 {
    private final Production11_400 production = new Production11_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}