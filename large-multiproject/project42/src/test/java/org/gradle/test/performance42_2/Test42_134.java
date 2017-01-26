package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_134 {
    private final Production42_134 production = new Production42_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}