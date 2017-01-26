package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_166 {
    private final Production72_166 production = new Production72_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}