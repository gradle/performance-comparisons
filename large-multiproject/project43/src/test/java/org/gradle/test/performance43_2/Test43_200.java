package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_200 {
    private final Production43_200 production = new Production43_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}