package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_43 {
    private final Production27_43 production = new Production27_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}