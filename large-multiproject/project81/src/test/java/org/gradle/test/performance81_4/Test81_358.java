package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_358 {
    private final Production81_358 production = new Production81_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}