package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_43 {
    private final Production62_43 production = new Production62_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}