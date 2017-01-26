package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_167 {
    private final Production86_167 production = new Production86_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}