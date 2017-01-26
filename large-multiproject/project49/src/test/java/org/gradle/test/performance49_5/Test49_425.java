package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_425 {
    private final Production49_425 production = new Production49_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}