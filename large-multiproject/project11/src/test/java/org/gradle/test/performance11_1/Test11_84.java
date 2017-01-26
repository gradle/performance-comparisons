package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_84 {
    private final Production11_84 production = new Production11_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}