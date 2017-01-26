package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_45 {
    private final Production30_45 production = new Production30_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}