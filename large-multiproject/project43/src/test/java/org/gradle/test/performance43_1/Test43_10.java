package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_10 {
    private final Production43_10 production = new Production43_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}