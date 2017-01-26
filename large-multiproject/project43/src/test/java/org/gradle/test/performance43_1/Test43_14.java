package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_14 {
    private final Production43_14 production = new Production43_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}