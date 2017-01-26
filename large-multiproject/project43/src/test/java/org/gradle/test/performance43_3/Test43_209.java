package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_209 {
    private final Production43_209 production = new Production43_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}