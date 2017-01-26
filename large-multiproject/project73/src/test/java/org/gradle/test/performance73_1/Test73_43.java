package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_43 {
    private final Production73_43 production = new Production73_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}