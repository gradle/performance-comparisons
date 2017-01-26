package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_172 {
    private final Production30_172 production = new Production30_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}