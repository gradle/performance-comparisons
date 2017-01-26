package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_119 {
    private final Production43_119 production = new Production43_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}