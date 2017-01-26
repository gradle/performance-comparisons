package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_390 {
    private final Production81_390 production = new Production81_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}