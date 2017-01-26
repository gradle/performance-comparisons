package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_255 {
    private final Production72_255 production = new Production72_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}