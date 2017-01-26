package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_465 {
    private final Production18_465 production = new Production18_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}