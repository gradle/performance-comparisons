package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_172 {
    private final Production26_172 production = new Production26_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}