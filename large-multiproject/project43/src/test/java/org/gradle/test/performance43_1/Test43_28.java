package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_28 {
    private final Production43_28 production = new Production43_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}