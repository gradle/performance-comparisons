package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_43 {
    private final Production30_43 production = new Production30_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}