package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_213 {
    private final Production81_213 production = new Production81_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}