package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_266 {
    private final Production43_266 production = new Production43_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}