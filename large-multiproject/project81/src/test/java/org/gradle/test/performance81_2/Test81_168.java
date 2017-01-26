package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_168 {
    private final Production81_168 production = new Production81_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}