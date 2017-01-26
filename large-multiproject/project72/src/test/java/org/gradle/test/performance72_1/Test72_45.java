package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_45 {
    private final Production72_45 production = new Production72_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}