package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_173 {
    private final Production81_173 production = new Production81_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}