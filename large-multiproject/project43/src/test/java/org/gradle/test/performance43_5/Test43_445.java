package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_445 {
    private final Production43_445 production = new Production43_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}