package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_425 {
    private final Production97_425 production = new Production97_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}