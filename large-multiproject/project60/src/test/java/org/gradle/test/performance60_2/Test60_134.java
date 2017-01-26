package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_134 {
    private final Production60_134 production = new Production60_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}