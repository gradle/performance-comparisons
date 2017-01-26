package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_172 {
    private final Production16_172 production = new Production16_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}