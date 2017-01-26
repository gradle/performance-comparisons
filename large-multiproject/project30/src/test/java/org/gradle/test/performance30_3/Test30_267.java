package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_267 {
    private final Production30_267 production = new Production30_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}