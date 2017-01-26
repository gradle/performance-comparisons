package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_267 {
    private final Production7_267 production = new Production7_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}