package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_288 {
    private final Production72_288 production = new Production72_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}