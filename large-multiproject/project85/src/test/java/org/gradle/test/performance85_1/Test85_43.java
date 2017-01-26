package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_43 {
    private final Production85_43 production = new Production85_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}