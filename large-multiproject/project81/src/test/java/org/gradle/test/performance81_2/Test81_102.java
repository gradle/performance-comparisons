package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_102 {
    private final Production81_102 production = new Production81_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}