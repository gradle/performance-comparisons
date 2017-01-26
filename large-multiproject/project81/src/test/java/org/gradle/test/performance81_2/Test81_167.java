package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_167 {
    private final Production81_167 production = new Production81_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}