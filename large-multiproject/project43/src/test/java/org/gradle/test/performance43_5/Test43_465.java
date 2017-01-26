package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_465 {
    private final Production43_465 production = new Production43_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}