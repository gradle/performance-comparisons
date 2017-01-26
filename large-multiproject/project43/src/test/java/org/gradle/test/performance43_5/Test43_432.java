package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_432 {
    private final Production43_432 production = new Production43_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}