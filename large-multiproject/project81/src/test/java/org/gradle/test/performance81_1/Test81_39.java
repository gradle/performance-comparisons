package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_39 {
    private final Production81_39 production = new Production81_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}