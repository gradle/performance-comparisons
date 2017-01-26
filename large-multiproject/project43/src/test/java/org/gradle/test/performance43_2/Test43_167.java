package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_167 {
    private final Production43_167 production = new Production43_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}