package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_98 {
    private final Production81_98 production = new Production81_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}