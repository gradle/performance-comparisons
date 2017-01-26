package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_27 {
    private final Production43_27 production = new Production43_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}