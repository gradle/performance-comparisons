package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_288 {
    private final Production43_288 production = new Production43_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}