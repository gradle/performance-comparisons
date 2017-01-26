package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_14 {
    private final Production81_14 production = new Production81_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}