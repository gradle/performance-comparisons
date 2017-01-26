package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_331 {
    private final Production72_331 production = new Production72_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}