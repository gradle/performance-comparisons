package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_167 {
    private final Production72_167 production = new Production72_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}