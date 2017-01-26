package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_35 {
    private final Production43_35 production = new Production43_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}