package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_324 {
    private final Production81_324 production = new Production81_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}