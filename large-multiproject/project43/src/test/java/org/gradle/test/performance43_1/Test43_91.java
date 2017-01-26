package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_91 {
    private final Production43_91 production = new Production43_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}