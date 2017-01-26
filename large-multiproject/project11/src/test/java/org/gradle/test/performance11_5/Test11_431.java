package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_431 {
    private final Production11_431 production = new Production11_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}