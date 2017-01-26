package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_200 {
    private final Production81_200 production = new Production81_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}