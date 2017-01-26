package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_8 {
    private final Production43_8 production = new Production43_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}