package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_425 {
    private final Production95_425 production = new Production95_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}