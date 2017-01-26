package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_172 {
    private final Production20_172 production = new Production20_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}