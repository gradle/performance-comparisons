package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_43 {
    private final Production24_43 production = new Production24_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}