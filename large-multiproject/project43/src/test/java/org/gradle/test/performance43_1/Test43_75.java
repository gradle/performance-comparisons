package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_75 {
    private final Production43_75 production = new Production43_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}