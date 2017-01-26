package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_401 {
    private final Production11_401 production = new Production11_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}