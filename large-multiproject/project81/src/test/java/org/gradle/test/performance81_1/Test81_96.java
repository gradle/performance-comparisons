package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_96 {
    private final Production81_96 production = new Production81_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}