package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_75 {
    private final Production30_75 production = new Production30_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}