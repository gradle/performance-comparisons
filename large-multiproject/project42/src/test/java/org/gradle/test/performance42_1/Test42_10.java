package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_10 {
    private final Production42_10 production = new Production42_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}