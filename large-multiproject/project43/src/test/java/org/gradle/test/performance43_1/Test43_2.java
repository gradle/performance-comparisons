package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_2 {
    private final Production43_2 production = new Production43_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}