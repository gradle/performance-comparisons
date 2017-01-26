package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_259 {
    private final Production43_259 production = new Production43_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}