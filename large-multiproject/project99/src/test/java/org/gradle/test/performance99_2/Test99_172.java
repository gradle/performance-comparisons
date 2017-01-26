package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_172 {
    private final Production99_172 production = new Production99_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}