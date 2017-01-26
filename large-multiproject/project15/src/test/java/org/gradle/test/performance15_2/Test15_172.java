package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_172 {
    private final Production15_172 production = new Production15_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}