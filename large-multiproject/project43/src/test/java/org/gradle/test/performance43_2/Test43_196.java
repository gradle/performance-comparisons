package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_196 {
    private final Production43_196 production = new Production43_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}