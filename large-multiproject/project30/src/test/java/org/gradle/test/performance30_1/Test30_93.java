package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_93 {
    private final Production30_93 production = new Production30_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}