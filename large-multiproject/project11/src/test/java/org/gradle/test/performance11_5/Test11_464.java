package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_464 {
    private final Production11_464 production = new Production11_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}