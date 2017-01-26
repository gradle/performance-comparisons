package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_76 {
    private final Production72_76 production = new Production72_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}