package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_68 {
    private final Production81_68 production = new Production81_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}