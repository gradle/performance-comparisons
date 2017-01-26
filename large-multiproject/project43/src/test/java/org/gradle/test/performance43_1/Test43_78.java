package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_78 {
    private final Production43_78 production = new Production43_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}