package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_347 {
    private final Production30_347 production = new Production30_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}