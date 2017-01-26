package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_41 {
    private final Production81_41 production = new Production81_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}