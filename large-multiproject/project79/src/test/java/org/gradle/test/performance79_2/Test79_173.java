package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_173 {
    private final Production79_173 production = new Production79_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}