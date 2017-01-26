package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_195 {
    private final Production81_195 production = new Production81_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}