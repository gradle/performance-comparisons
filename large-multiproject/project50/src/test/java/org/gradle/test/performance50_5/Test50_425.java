package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_425 {
    private final Production50_425 production = new Production50_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}