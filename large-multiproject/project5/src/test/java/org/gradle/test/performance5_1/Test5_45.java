package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_45 {
    private final Production5_45 production = new Production5_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}