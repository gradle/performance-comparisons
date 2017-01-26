package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_255 {
    private final Production5_255 production = new Production5_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}