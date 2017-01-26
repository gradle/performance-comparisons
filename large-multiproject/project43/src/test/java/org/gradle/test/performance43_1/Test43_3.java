package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_3 {
    private final Production43_3 production = new Production43_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}