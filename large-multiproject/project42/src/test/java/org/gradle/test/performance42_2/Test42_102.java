package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_102 {
    private final Production42_102 production = new Production42_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}