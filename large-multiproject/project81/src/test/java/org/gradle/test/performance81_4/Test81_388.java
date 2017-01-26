package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_388 {
    private final Production81_388 production = new Production81_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}