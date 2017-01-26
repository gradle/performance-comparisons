package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_183 {
    private final Production43_183 production = new Production43_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}