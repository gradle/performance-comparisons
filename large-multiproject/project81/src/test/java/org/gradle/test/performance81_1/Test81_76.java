package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_76 {
    private final Production81_76 production = new Production81_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}