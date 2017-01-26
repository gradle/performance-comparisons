package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_29 {
    private final Production43_29 production = new Production43_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}