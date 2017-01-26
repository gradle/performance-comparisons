package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_78 {
    private final Production81_78 production = new Production81_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}