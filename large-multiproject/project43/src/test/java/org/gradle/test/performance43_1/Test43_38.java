package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_38 {
    private final Production43_38 production = new Production43_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}