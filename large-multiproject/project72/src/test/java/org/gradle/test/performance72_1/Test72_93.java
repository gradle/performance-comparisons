package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_93 {
    private final Production72_93 production = new Production72_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}