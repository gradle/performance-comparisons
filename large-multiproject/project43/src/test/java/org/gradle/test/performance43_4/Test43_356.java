package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_356 {
    private final Production43_356 production = new Production43_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}