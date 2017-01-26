package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_80 {
    private final Production81_80 production = new Production81_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}