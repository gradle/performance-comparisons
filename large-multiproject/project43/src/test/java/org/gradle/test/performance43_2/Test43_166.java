package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_166 {
    private final Production43_166 production = new Production43_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}