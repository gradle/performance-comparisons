package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_447 {
    private final Production81_447 production = new Production81_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}