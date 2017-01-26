package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_458 {
    private final Production43_458 production = new Production43_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}