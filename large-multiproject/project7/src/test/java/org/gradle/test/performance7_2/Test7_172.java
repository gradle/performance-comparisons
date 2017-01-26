package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_172 {
    private final Production7_172 production = new Production7_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}