package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_85 {
    private final Production40_85 production = new Production40_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}