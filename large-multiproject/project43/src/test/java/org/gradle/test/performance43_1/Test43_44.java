package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_44 {
    private final Production43_44 production = new Production43_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}