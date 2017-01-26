package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_356 {
    private final Production42_356 production = new Production42_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}