package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_310 {
    private final Production81_310 production = new Production81_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}