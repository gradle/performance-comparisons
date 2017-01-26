package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_43 {
    private final Production99_43 production = new Production99_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}