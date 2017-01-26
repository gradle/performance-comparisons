package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_267 {
    private final Production42_267 production = new Production42_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}