package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_2 {
    private final Production81_2 production = new Production81_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}