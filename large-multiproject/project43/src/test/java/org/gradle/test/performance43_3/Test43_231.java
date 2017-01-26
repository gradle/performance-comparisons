package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_231 {
    private final Production43_231 production = new Production43_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}