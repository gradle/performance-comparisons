package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_43 {
    private final Production42_43 production = new Production42_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}