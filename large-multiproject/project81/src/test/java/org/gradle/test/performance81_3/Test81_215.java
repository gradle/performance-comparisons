package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_215 {
    private final Production81_215 production = new Production81_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}