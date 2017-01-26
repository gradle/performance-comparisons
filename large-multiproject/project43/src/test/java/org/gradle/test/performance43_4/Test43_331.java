package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_331 {
    private final Production43_331 production = new Production43_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}