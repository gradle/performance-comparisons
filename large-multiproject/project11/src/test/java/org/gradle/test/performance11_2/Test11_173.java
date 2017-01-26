package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_173 {
    private final Production11_173 production = new Production11_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}