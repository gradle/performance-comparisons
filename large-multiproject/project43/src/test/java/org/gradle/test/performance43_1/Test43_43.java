package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_43 {
    private final Production43_43 production = new Production43_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}