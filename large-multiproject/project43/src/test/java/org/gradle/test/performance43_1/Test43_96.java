package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_96 {
    private final Production43_96 production = new Production43_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}