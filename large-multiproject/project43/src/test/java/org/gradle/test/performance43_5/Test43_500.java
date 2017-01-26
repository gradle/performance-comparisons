package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_500 {
    private final Production43_500 production = new Production43_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}