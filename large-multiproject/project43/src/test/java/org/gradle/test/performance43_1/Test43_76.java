package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_76 {
    private final Production43_76 production = new Production43_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}