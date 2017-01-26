package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_347 {
    private final Production5_347 production = new Production5_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}