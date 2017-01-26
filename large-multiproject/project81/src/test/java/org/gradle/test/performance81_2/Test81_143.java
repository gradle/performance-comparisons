package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_143 {
    private final Production81_143 production = new Production81_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}