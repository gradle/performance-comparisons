package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_338 {
    private final Production43_338 production = new Production43_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}