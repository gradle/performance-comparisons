package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_398 {
    private final Production81_398 production = new Production81_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}