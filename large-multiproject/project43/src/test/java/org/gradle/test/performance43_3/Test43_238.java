package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_238 {
    private final Production43_238 production = new Production43_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}