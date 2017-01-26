package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_119 {
    private final Production81_119 production = new Production81_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}