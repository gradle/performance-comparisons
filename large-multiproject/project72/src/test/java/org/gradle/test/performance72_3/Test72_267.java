package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_267 {
    private final Production72_267 production = new Production72_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}