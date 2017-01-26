package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_98 {
    private final Production90_98 production = new Production90_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}