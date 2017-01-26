package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_325 {
    private final Production42_325 production = new Production42_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}