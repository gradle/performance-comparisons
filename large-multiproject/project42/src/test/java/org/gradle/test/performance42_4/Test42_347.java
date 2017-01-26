package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_347 {
    private final Production42_347 production = new Production42_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}