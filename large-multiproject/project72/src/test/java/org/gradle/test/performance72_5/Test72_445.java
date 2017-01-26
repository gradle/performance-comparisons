package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_445 {
    private final Production72_445 production = new Production72_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}