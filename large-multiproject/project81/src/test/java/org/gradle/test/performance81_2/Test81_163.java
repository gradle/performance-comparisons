package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_163 {
    private final Production81_163 production = new Production81_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}