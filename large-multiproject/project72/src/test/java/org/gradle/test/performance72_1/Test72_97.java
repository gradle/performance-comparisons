package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_97 {
    private final Production72_97 production = new Production72_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}