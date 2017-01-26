package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_139 {
    private final Production97_139 production = new Production97_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}