package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_172 {
    private final Production5_172 production = new Production5_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}