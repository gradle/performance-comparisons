package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_40 {
    private final Production43_40 production = new Production43_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}