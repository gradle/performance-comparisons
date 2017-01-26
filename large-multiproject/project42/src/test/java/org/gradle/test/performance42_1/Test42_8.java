package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_8 {
    private final Production42_8 production = new Production42_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}