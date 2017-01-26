package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_415 {
    private final Production81_415 production = new Production81_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}