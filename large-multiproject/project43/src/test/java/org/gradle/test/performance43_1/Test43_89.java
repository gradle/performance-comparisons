package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_89 {
    private final Production43_89 production = new Production43_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}