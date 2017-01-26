package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_97 {
    private final Production43_97 production = new Production43_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}