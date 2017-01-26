package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_38 {
    private final Production81_38 production = new Production81_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}