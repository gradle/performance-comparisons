package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_60 {
    private final Production81_60 production = new Production81_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}