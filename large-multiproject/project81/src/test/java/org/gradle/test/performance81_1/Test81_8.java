package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_8 {
    private final Production81_8 production = new Production81_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}