package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_80 {
    private final Production43_80 production = new Production43_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}