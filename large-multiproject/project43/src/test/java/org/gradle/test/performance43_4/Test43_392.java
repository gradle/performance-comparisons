package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_392 {
    private final Production43_392 production = new Production43_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}