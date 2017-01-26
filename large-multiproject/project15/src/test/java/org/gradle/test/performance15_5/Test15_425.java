package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_425 {
    private final Production15_425 production = new Production15_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}