package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_432 {
    private final Production81_432 production = new Production81_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}