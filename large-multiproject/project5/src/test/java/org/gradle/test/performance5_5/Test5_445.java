package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_445 {
    private final Production5_445 production = new Production5_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}