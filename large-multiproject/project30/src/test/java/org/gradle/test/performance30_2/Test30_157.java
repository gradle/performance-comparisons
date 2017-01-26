package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_157 {
    private final Production30_157 production = new Production30_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}