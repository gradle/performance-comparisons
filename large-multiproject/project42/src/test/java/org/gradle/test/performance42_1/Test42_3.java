package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_3 {
    private final Production42_3 production = new Production42_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}