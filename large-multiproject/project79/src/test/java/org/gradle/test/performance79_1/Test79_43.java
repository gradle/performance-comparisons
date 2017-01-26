package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_43 {
    private final Production79_43 production = new Production79_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}