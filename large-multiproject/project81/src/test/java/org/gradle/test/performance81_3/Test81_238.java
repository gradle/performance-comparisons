package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_238 {
    private final Production81_238 production = new Production81_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}