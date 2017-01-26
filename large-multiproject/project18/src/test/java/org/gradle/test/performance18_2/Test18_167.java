package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_167 {
    private final Production18_167 production = new Production18_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}