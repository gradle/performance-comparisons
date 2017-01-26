package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_66 {
    private final Production42_66 production = new Production42_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}