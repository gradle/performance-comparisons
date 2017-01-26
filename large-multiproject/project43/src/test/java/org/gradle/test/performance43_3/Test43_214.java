package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_214 {
    private final Production43_214 production = new Production43_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}