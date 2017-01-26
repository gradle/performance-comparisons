package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_89 {
    private final Production72_89 production = new Production72_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}