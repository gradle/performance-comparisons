package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_212 {
    private final Production43_212 production = new Production43_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}