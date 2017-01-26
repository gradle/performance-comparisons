package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_67 {
    private final Production43_67 production = new Production43_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}