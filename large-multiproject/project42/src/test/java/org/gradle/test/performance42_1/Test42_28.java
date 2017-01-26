package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_28 {
    private final Production42_28 production = new Production42_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}