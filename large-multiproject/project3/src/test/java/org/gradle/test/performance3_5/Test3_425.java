package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_425 {
    private final Production3_425 production = new Production3_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}