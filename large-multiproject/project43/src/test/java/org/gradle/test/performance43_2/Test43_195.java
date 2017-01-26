package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_195 {
    private final Production43_195 production = new Production43_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}