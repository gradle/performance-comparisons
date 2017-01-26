package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_442 {
    private final Production43_442 production = new Production43_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}