package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_373 {
    private final Production81_373 production = new Production81_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}