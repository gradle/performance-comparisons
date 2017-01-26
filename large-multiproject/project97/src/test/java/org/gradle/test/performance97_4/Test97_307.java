package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_307 {
    private final Production97_307 production = new Production97_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}