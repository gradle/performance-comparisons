package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_172 {
    private final Production43_172 production = new Production43_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}