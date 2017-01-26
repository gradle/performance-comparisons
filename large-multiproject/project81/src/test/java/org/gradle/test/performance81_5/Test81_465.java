package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_465 {
    private final Production81_465 production = new Production81_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}