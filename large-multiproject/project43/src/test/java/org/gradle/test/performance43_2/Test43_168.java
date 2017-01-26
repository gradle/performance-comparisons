package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_168 {
    private final Production43_168 production = new Production43_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}